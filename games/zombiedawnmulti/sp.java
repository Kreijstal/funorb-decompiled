/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends mp {
    private int field_j;
    private int field_m;
    static boolean field_h;
    private boolean field_o;
    private fm field_f;
    static int field_g;
    private int field_n;
    private int field_k;
    private int field_l;
    private String field_i;

    private final td a(fm param0, String param1, int param2, int param3) {
        td var5 = null;
        RuntimeException var5_ref = null;
        td var6 = null;
        td stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                this.field_j = -34;
                break L1;
              }
            }
            var6 = new td(param2 - param0.field_C, param2 + param0.field_r, param1.length());
            var5 = var6;
            this.field_e = new td[]{var6};
            stackIn_3_0 = (td) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("sp.L(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, boolean param2, String param3, fm param4) {
        td var8 = null;
        td var9 = null;
        if (param3 == null) {
            this.field_e = null;
            return;
        }
        if (this.field_f == param4 && this.field_o && (this.field_m ^ -1) == -3 && this.field_i != null) {
            if (!(!this.field_i.equals(param3))) {
                return;
            }
        }
        try {
            this.field_m = 2;
            this.field_o = param2 ? true : false;
            this.field_i = param3;
            this.field_f = param4;
            var8 = this.a(param4, param3, param1, 1);
            var9 = var8;
            var9.field_e[0] = -param4.a(param3) + param0;
            var9.field_e[param3.length()] = param0;
            qd.a(param4, 0, param3, 109, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, fm param2, String param3, int param4) {
        td var8 = null;
        td var9 = null;
        if (!(param3 != null)) {
            this.field_e = null;
            return;
        }
        if (param2 == this.field_f && this.field_o && -1 == (this.field_m ^ -1) && this.field_i != null) {
            if (!(!this.field_i.equals(param3))) {
                return;
            }
        }
        try {
            this.field_o = true;
            this.field_m = 0;
            this.field_i = param3;
            int var7 = -125 / ((-24 - param1) / 46);
            this.field_f = param2;
            var8 = this.a(param2, param3, param4, 1);
            var9 = var8;
            var8.field_e[0] = param0;
            var9.field_e[param3.length()] = param0 - -param2.a(param3);
            qd.a(param2, 0, param3, 116, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void c(int param0) {
        java.awt.Frame var2;
        L0: {
          nb.field_a.h(param0 ^ -123);
          if (pj.field_I == null) {
            pj.field_I = new ta(nb.field_a, pm.field_P);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          var2 = (java.awt.Frame) null;
          sp.a((go) null, -50, (java.awt.Frame) null);
          nb.field_a.b(param0 + 3016, pj.field_I);
          return;
        } else {
          nb.field_a.b(param0 + 3016, pj.field_I);
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6, fm param7) {
        td stackIn_39_0;
        td stackIn_39_1;
        int stackIn_39_2;
        int stackIn_39_3;
        td stackIn_40_0 = null;
        td stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        fm stackIn_44_0 = null;
        fm stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        td var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param4 <= -16) {
              L1: {
                if (param3 != 0) {
                  break L1;
                } else {
                  param3 = param7.field_w;
                  break L1;
                }
              }
              if (param0 == null) {
                this.field_e = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param7 != this.field_f) {
                    break L2;
                  } else {
                    if (this.field_o) {
                      break L2;
                    } else {
                      if (this.field_m != param1) {
                        break L2;
                      } else {
                        if (this.field_j != param5) {
                          break L2;
                        } else {
                          if (this.field_n != param3) {
                            break L2;
                          } else {
                            if (param2 != this.field_l) {
                              break L2;
                            } else {
                              if (param6 != this.field_k) {
                                break L2;
                              } else {
                                if (null == this.field_i) {
                                  break L2;
                                } else {
                                  if (this.field_i.equals(param0)) {
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    break L2;
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
                L3: {
                  this.field_l = param2;
                  this.field_j = param5;
                  this.field_k = param6;
                  this.field_f = param7;
                  this.field_i = param0;
                  this.field_n = param3;
                  this.field_o = false;
                  this.field_m = param1;
                  var16 = new String[param7.b(param0, param6) + 1];
                  var17 = var16;
                  var10 = Math.max(1, param7.a(param0, new int[]{param6}, var17));
                  if ((this.field_j ^ -1) != -4) {
                    break L3;
                  } else {
                    if (-2 == (var10 ^ -1)) {
                      this.field_j = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    this.field_e = new td[var10];
                    if (this.field_j == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (this.field_j != 1) {
                          break L6;
                        } else {
                          var11 = param7.field_C + (this.field_l + -(var10 * this.field_n) >> -1852565727);
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (2 != this.field_j) {
                          break L7;
                        } else {
                          var11 = -(this.field_n * var10) + -param7.field_r + this.field_l;
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        var12 = (-(this.field_n * var10) + this.field_l) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L8;
                        } else {
                          var12 = 0;
                          break L8;
                        }
                      }
                      this.field_n = this.field_n + var12;
                      var11 = param7.field_C + var12;
                      if (var15 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param7.field_C;
                  break L4;
                }
                var12 = 0;
                L9: while (true) {
                  L10: {
                    if (var12 >= var10) {
                      break L10;
                    } else {
                      var13 = var16[var12];
                      if (var15 == 0) {
                        L11: {
                          stackIn_39_0 = null;

                          stackIn_39_1 = null;

                          stackIn_39_2 = -param7.field_C + var11;

                          stackIn_39_3 = var11 + param7.field_r;

                          if (var13 != null) {
                            stackIn_40_0 = null;
                            stackIn_40_1 = null;
                            stackIn_40_2 = stackIn_39_2;
                            stackIn_40_3 = stackIn_39_3;
                            stackIn_40_4 = var13.length();
                            break L11;
                          } else {
                            stackIn_40_0 = null;
                            stackIn_40_1 = null;
                            stackIn_40_2 = stackIn_39_2;
                            stackIn_40_3 = stackIn_39_3;
                            stackIn_40_4 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          var14 = new td(stackIn_40_2, stackIn_40_3, stackIn_40_4);
                          var14.field_e[0] = 0;
                          if (var13 != null) {
                            L13: {
                              var14.field_e[var13.length()] = param7.a(var13);
                              stackIn_44_0 = (fm) (param7);

                              if ((param1 ^ -1) != -4) {
                                stackIn_45_0 = (fm) ((Object) stackIn_44_0);
                                stackIn_45_1 = 0;
                                break L13;
                              } else {
                                stackIn_45_0 = (fm) ((Object) stackIn_44_0);
                                stackIn_45_1 = this.a(var13, 0, param7.a(var13), param6);
                                break L13;
                              }
                            }
                            qd.a(stackIn_45_0, stackIn_45_1, var13, 120, var14);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        this.field_e[var12] = var14;
                        var11 = var11 + param3;
                        var12++;
                        if (var15 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var9);

            stackIn_50_1 = new StringBuilder().append("sp.O(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L14;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L15;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L15;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_51_0), stackIn_54_2 + ')');
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

    final void a(fm param0, String param1, int param2, byte param3, int param4) {
        td var8 = null;
        int var7 = 0;
        if (param1 == null) {
            this.field_e = null;
            return;
        }
        if (this.field_f == param0 && this.field_o && this.field_m == 1 && this.field_i != null) {
            if (!(!this.field_i.equals(param1))) {
                return;
            }
        }
        try {
            this.field_m = 1;
            this.field_f = param0;
            this.field_o = true;
            if (param3 != 65) {
                this.field_o = false;
            }
            var8 = this.a(param0, param1, param2, 1);
            var7 = param0.a(param1);
            var8.field_e[0] = param4 + -(var7 >> 1001919233);
            var8.field_e[param1.length()] = param4 - -(var7 >> 1668492769);
            qd.a(param0, 0, param1, param3 ^ 61, var8);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(go param0, int param1, java.awt.Frame param2) {
        RuntimeException runtimeException = null;
        di var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = param0.a(param2, true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 != var3.field_f) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vd.a(false, 10L);
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (1 != var3.field_f) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        vd.a(false, 100L);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1 == 1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        param2.setVisible(false);
                        param2.dispose();
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("sp.N(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param2 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public sp() {
    }

    static {
        field_h = true;
    }
}
