/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qi extends ek {
    private pk field_P;
    static String field_L;
    private String[] field_K;
    private vj field_O;
    static vj field_Q;
    static vj field_S;
    static String field_N;
    static String field_T;
    static ck field_R;
    static boolean field_M;

    String c(byte param0) {
        if (null != this.field_P) {
          if (null != this.field_K) {
            if (this.field_K.length > this.field_P.field_p) {
              if (param0 != 113) {
                return (String) null;
              } else {
                return this.field_K[this.field_P.field_p];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = -125 % ((-61 - param0) / 43);
        this.b(((nl) ((Object) this.field_p)).a((ce) (this), -125), param3, param1, param2, -16555);
    }

    final static void a(boolean param0, byte param1) {
        int[] stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int[] stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        if (!lk.field_F) {
          if (mg.field_Zb) {
            cl.field_B = qj.a(-21, param0);
            return;
          } else {
            if (fm.field_e) {
              am.field_a = ib.a((byte) -108, param0);
              return;
            } else {
              if (he.field_db) {
                jm.a(0, param0);
                he.field_db = false;
                return;
              } else {
                if (ob.field_k) {
                  tj.a(param0, 111);
                  gi.field_b = true;
                  ob.field_k = false;
                  return;
                } else {
                  kf.field_G.c(-1, param0);
                  if (param1 < -99) {
                    return;
                  } else {
                    qi.h(-32);
                    return;
                  }
                }
              }
            }
          }
        } else {
          L0: {
            stackIn_3_0 = j.field_d;

            stackIn_3_1 = param0;

            if (gk.field_Ib) {
              stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = 2;
              break L0;
            } else {
              stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = 1;
              break L0;
            }
          }
          h.field_d = uh.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, -104);
          return;
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 48, param2, param3);
              this.field_P = null;
              if (this.field_q) {
                var5_int = -this.field_u + (bh.field_g + -param3);
                var6 = pm.field_f - (param2 - -this.field_D);
                this.field_P = this.a(1, var6, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 38) {
                break L2;
              } else {
                this.field_K = (String[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("qi.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (null == this.field_K) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 >= this.field_K.length) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new String[param1 + 1];
                        var4 = var7;
                        if (null != this.field_K) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_K.length <= var5) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7[var5] = this.field_K[var5];
                        var5++;
                        if (var6 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_K = var7;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_K[param1] = param0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("qi.J(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        pk var6;
        int var7;
        int var8;
        nl var10;
        nl var11;
        super.a(param0, -128, param2, param3);
        if (param1 < -103) {
          if (param2 != 0) {
            return;
          } else {
            L0: {
              var11 = (nl) ((Object) this.field_p);
              var6 = this.field_P;
              if (var6 != null) {
                var7 = var11.a((byte) 24, (ce) (this), param0);
                var8 = var11.a(param3, 0, (ce) (this));
                L1: while (true) {
                  kd.a(2 + var6.field_n, var6.field_t + (var7 - 2), (byte) -128, -2 + (var6.field_u + var8), var6.field_s - -2);
                  var6 = var6.field_o;
                  if (var6 != null) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          this.a(112);
          if (param2 != 0) {
            return;
          } else {
            L2: {
              var10 = (nl) ((Object) this.field_p);
              var6 = this.field_P;
              if (var6 != null) {
                var7 = var10.a((byte) 24, (ce) (this), param0);
                var8 = var10.a(param3, 0, (ce) (this));
                L3: while (true) {
                  kd.a(2 + var6.field_n, var6.field_t + (var7 - 2), (byte) -128, -2 + (var6.field_u + var8), var6.field_s - -2);
                  var6 = var6.field_o;
                  if (var6 != null) {
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    final static w e(byte param0) {
        int var1 = 48 / ((64 - param0) / 52);
        return qa.d(5);
    }

    final static void a(float param0, int param1, String param2) {
        try {
            cg.field_d = param0;
            he.field_hb = param2;
            int var3_int = 79 / ((-18 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qi.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final pk a(int param0, int param1, int param2) {
        int statePc = 0;
        pk var4 = null;
        pk var5 = null;
        int var6 = 0;
        ce var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    var4 = (pk) ((Object) this.field_O.c((byte) 49));
                    if (param0 != 1) {
                        statePc = 16;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var4 != null) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return null;
                }
                case 3: {
                    var5 = var4;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == null) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var6 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param2 < var5.field_t) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var5.field_u > param1) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param2 >= var5.field_n + var5.field_t) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5.field_u - -var5.field_s >= param1) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var4;
                }
                case 12: {
                    var5 = var5.field_o;
                    if (var6 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4 = (pk) ((Object) this.field_O.d(true));
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return null;
                }
                case 16: {
                    var7 = (ce) null;
                    this.a((ce) null, 8, -16, -10);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var4 != null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return null;
                }
                case 19: {
                    var5 = var4;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var5 == null) {
                        statePc = 29;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var6 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (param2 < var5.field_t) {
                        statePc = 28;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var5.field_u > param1) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (param2 >= var5.field_n + var5.field_t) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var5.field_u - -var5.field_s >= param1) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return var4;
                }
                case 28: {
                    var5 = var5.field_o;
                    if (var6 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = (pk) ((Object) this.field_O.d(true));
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var6 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(byte param0) {
        field_R = null;
        field_S = null;
        field_L = null;
        int var1 = -63 % ((-30 - param0) / 38);
        field_T = null;
        field_N = null;
        field_Q = null;
    }

    boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_N = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qi.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void h(int param0) {
        hm.a(param0, (byte) -104);
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        pk var7;
        super.b(param0, param1, param2, param3);
        var5 = -this.field_u + param0;
        var6 = param1 + -this.field_D;
        var7 = this.a(1, var6, var5);
        if (var7 == null) {
          return;
        } else {
          L0: {
            if (null != this.field_v) {
              ((rl) ((Object) this.field_v)).a((qi) (this), param2, -118, var7.field_p);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(2874);
    }

    final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int statePc = 0;
        int var2 = 0;
        nl var3 = null;
        cf var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        nl var17_ref = null;
        String var21 = null;
        cf var22 = null;
        nf var23 = null;
        pk var24 = null;
        Object var25 = null;
        String var26 = null;
        cf var27 = null;
        nf var28 = null;
        pk var29 = null;
        nl var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    var25 = null;
                    var16 = client.field_A ? 1 : 0;
                    this.field_O = new vj();
                    var2 = 0;
                    if (param0 == 2874) {
                        statePc = 25;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_S = (vj) null;
                    var17_ref = (nl) ((Object) this.field_p);
                    var3 = var17_ref;
                    var22 = var17_ref.a((ce) (this), (byte) 117);
                    var4 = var22;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = this.field_E.indexOf("<hotspot=", var2);
                    stackIn_3_0 = 0;
                    stackIn_3_1 = var5 ^ -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var7 = this.field_E.indexOf(">", var5);
                    var21 = this.field_E.substring(9 + var5, var7);
                    var7 = Integer.parseInt(var21);
                    var2 = this.field_E.indexOf("</hotspot>", var5);
                    var8 = var22.a(false, var5);
                    var9 = var22.a(false, var2);
                    var10 = null;
                    if (var16 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    var11 = var8;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var11 > var9) {
                        statePc = 23;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var23 = var22.field_a[var11];
                    stackIn_3_0 = var11;
                    stackIn_11_0 = stackIn_3_0;
                    stackIn_3_1 = var8;
                    stackIn_11_1 = stackIn_3_1;
                    if (var16 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != stackIn_11_1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = var22.a((byte) -94, var5);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = var23.field_a[0];
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var13 = stackIn_14_0;
                    if (var9 != var11) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_19_0 = var22.a((byte) -94, var2);
                    statePc = 19;
                    continue stateLoop;
                }
                case 16: {
                    if (var23 != null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = var23.field_a[var23.field_a.length + -1];
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var14 = stackIn_19_0;
                    var24 = new pk(var7, var13, var23.field_c, var14 - var13, Math.max(var17_ref.a((byte) -120), -var23.field_c + var23.field_i));
                    if (var10 != null) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((pk) (var10)).field_o = var24;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_O.a(var24, 2777);
                    var10 = var24;
                    var11++;
                    if (var16 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var16 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 25: {
                    var30 = (nl) ((Object) this.field_p);
                    var27 = var30.a((ce) (this), (byte) 117);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var5 = this.field_E.indexOf("<hotspot=", var2);
                    stackIn_27_0 = 0;
                    stackIn_27_1 = var5 ^ -1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 != stackIn_27_1) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 29: {
                    var7 = this.field_E.indexOf(">", var5);
                    var26 = this.field_E.substring(9 + var5, var7);
                    var7 = Integer.parseInt(var26);
                    var2 = this.field_E.indexOf("</hotspot>", var5);
                    var8 = var27.a(false, var5);
                    var9 = var27.a(false, var2);
                    var10 = null;
                    if (var16 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    var11 = var8;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var11 > var9) {
                        statePc = 46;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var28 = var27.field_a[var11];
                    stackIn_27_0 = var11;
                    stackIn_34_0 = stackIn_27_0;
                    stackIn_27_1 = var8;
                    stackIn_34_1 = stackIn_27_1;
                    if (var16 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0 != stackIn_34_1) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = var27.a((byte) -94, var5);
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = var28.field_a[0];
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var13 = stackIn_37_0;
                    if (var9 != var11) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_42_0 = var27.a((byte) -94, var2);
                    statePc = 42;
                    continue stateLoop;
                }
                case 39: {
                    if (var28 != null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = var28.field_a[var28.field_a.length + -1];
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var14 = stackIn_42_0;
                    var29 = new pk(var7, var13, var28.field_c, var14 - var13, Math.max(var30.a((byte) -120), -var28.field_c + var28.field_i));
                    if (var10 != null) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((pk) (var10)).field_o = var29;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    this.field_O.a(var29, 2777);
                    var10 = var29;
                    var11++;
                    if (var16 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var16 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qi(String param0, gl param1) {
        super(param0, (kg) null);
        this.field_P = null;
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "to over <%0> great games";
        field_L = "Fast Drop Bonus: ";
        field_T = "Checking";
        field_Q = new vj();
        field_R = new ck(270, 70);
    }
}
