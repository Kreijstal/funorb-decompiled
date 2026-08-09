/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends hq {
    static ri field_u;
    private mk field_w;
    private mk[] field_s;
    static String field_v;
    static String field_t;

    private final void a(jl param0, boolean param1, byte param2) {
        mk dupTemp$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        mk var5 = null;
        mk var6 = null;
        int var7 = 0;
        ja var8 = null;
        mk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        mk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        mk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        mk stackIn_11_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        super.a(-3, param0);
                        if (!param1) {
                            statePc = 14;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (6 <= var4_int) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = this.field_s[var4_int];
                        var6 = var5;
                        var6 = var5;
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 != null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param0.field_s[var4_int] = null;
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = param0.field_s[var4_int];
                        stackIn_10_0 = (mk) (var5);
                        stackIn_9_0 = stackIn_10_0;
                        stackIn_10_1 = 100;
                        stackIn_9_1 = stackIn_10_1;
                        if (var6 != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dupTemp$2 = new mk();
                        param0.field_s[var4_int] = dupTemp$2;
                        stackIn_11_0 = (mk) ((Object) stackIn_9_0);
                        stackIn_11_1 = stackIn_9_1;
                        stackIn_11_2 = (mk) (dupTemp$2);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (mk) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = (mk) (var6);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((mk) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        d.a(this.field_s, 0, param0.field_s, 0, 6);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param2 < -107) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = (ja) null;
                        this.a((ja) null, (byte) -75);
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var4);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("jl.H(");
                    stackIn_19_1 = stackIn_20_1;
                    if (param0 == null) {
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
                    throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, fm param6, pd param7, pd param8, int param9, int param10, int param11, int param12, int param13, int param14, fm param15, int param16, int param17, pd param18, int param19, boolean param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              lj.a(param6, param4, param15, 61);
              ek.a(param16, param0, 1829947600, param9, param10);
              uo.a(param13, param1, 1633);
              if (param20) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            vl.a(param18, param8, 127, param2, param12, param11);
            qb.a(param17, (byte) -115, param7, param14);
            nn.a((byte) 55, param3, param19, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("jl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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

            if (param7 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final mk a(int param0, byte param1) {
        mk dupTemp$2 = null;
        mk dupTemp$3 = null;
        jl var4;
        if (param1 != -36) {
          var4 = (jl) null;
          this.a((jl) null, false, (byte) -31);
          dupTemp$2 = new mk();
          this.field_s[param0] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new mk();
          this.field_s[param0] = dupTemp$3;
          return dupTemp$3;
        }
    }

    final void a(ja[] param0, int param1, boolean param2) {
        int var4_int = 0;
        if (param2) {
            return;
        }
        try {
            var4_int = param1;
            if (null == this.field_s[var4_int]) {
                this.field_s[var4_int] = new mk();
            }
            this.field_s[param1].field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    jl(jl param0, boolean param1) {
        this();
        try {
            param0.a((jl) (this), param1, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet b(int param0) {
        if (null != fd.field_L) {
            return fd.field_L;
        }
        if (param0 != 0) {
            field_v = (String) null;
            return (java.applet.Applet) ((Object) tg.field_i);
        }
        return (java.applet.Applet) ((Object) tg.field_i);
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        cf stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        mk var7 = null;
        mk var9 = null;
        jl var10 = null;
        gn var11 = null;
        mk var12 = null;
        mk var13 = null;
        mk var14 = null;
        mk var15 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof gn) {
                stackIn_3_0 = (cf) (param4);
                break L1;
              } else {
                stackIn_3_0 = null;
                break L1;
              }
            }
            L2: {
              var11 = (gn) ((Object) stackIn_3_0);
              nm.a(param3 - -param4.field_y, param4.field_w + (param4.field_i + param1), (byte) 105, param3 - -param4.field_y - -param4.field_n, param1 - -param4.field_i);
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_F;
                break L2;
              }
            }
            L3: {
              var7 = this.field_s[0];
              this.field_w.a((byte) 11);
              var7.a(-11108, param3, param1, (jl) (this), param4, this.field_w);
              if (var11 != null) {
                L4: {
                  if (var11.field_G) {
                    var12 = this.field_s[1];
                    if (var12 != null) {
                      var12.a(param2 + 4004, param3, param1, (jl) (this), param4, this.field_w);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (var11.field_l) {
                  L5: {
                    L6: {
                      var13 = this.field_s[3];
                      if (var11.field_u == 0) {
                        break L6;
                      } else {
                        if (var13 != null) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var9 = this.field_s[2];
                      if (var9 == null) {
                        break L7;
                      } else {
                        var9.a(param2 + 4004, param3, param1, (jl) (this), param4, this.field_w);
                        break L7;
                      }
                    }
                    if (!ZombieDawnMulti.field_E) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  var13.a(param2 ^ 4196, param3, param1, (jl) (this), param4, this.field_w);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L8: {
              if (param4.c(126)) {
                var14 = this.field_s[5];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a(-11108, param3, param1, (jl) (this), param4, this.field_w);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (!param0) {
                var15 = this.field_s[4];
                if (var15 == null) {
                  break L9;
                } else {
                  var15.a(-11108, param3, param1, (jl) (this), param4, this.field_w);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            this.field_w.a(param3, false, (jl) (this), param4, param1);
            ql.a(true);
            if (param2 == -15112) {
              break L0;
            } else {
              var10 = (jl) null;
              this.a((jl) null, false, (byte) -63);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("jl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
    }

    final void a(ja param0, byte param1) {
        RuntimeException runtimeException = null;
        mk[] var3 = null;
        int var4 = 0;
        mk var5_ref_mk = null;
        int var5 = 0;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var7.length <= var4) {
                  break L2;
                } else {
                  L3: {
                    var5_ref_mk = var7[var4];
                    if (var5_ref_mk != null) {
                      var5_ref_mk.field_k = param0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = 3 % ((22 - param1) / 49);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("jl.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7;
        pd var8;
        L0: {
          L1: {
            if ((va.field_a ^ -1) == -3) {
              break L1;
            } else {
              var7 = pi.field_e;
              if (!ZombieDawnMulti.field_E) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var7 = nc.field_c;
          break L0;
        }
        gf.a(127, param2, param4, param5, var7, param6, param0, param3);
        if (param1 != -97) {
          var8 = (pd) null;
          jl.a(-33, 72, 86, 111, -101, -58, (fm) null, (pd) null, (pd) null, -42, -100, -45, 56, 89, -124, (fm) null, -98, -113, (pd) null, -13, true);
          return;
        } else {
          return;
        }
    }

    final void a(ja[] param0, boolean param1) {
        mk[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        mk var5 = null;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = this.field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7.length <= var4) {
                    break L3;
                  } else {
                    var5 = var7[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 != null) {
                          var5.field_e = param0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param1) {
                  break L2;
                } else {
                  this.field_w = (mk) null;
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("jl.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public jl() {
        this.field_s = new mk[6];
        this.field_w = new mk();
        mk dupTemp$0 = new mk();
        this.field_s[0] = dupTemp$0;
        mk var1 = dupTemp$0;
        var1.a((byte) 11);
    }

    public static void a(boolean param0) {
        field_t = null;
        field_v = null;
        field_u = null;
        if (param0) {
            field_t = (String) null;
        }
    }

    static {
        field_t = "Average rating";
        field_v = "Logging in...";
    }
}
