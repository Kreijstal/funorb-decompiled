/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends bi {
    static String field_V;
    private String field_U;
    static String field_Q;
    private String field_P;
    private boolean field_T;
    private boolean field_S;
    private qe field_R;

    final void a(int param0, byte param1, int param2) {
        super.a(param0, (byte) -127, param2);
        rh.field_q.c(this.field_P, (this.field_l >> 214208577) + param2, 103 + param0, 16777215, -1);
        if (param1 <= -79) {
          if (null != this.field_U) {
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            rh.field_q.a(this.field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
          } else {
            return;
          }
        } else {
          this.field_T = false;
          if (null == this.field_U) {
            return;
          } else {
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            rh.field_q.a(this.field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
          }
        }
    }

    final void r(int param0) {
        int var2 = -126 / ((param0 - 54) / 62);
        this.field_R.field_w = false;
        this.field_T = true;
    }

    sd(da param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_U = param1;
            if (this.field_U != null) {
                var3_int = rh.field_q.a(this.field_U, 260, rh.field_q.field_y);
                this.a(300, var3_int + 150, false);
            }
            this.field_R = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_R.field_w = true;
            this.field_T = false;
            this.field_S = false;
            this.a((qg) (this.field_R), (byte) -120);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void q(int param0) {
        if (param0 != 274) {
            field_V = (String) null;
        }
    }

    final void a(boolean param0, String param1, byte param2, float param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_S) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_3_0 == stackIn_6_1) {
                break L3;
              } else {
                L4: {
                  stackIn_9_0 = this;

                  if (!param0) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L4;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L4;
                  }
                }
                ((sd) (this)).field_S = stackIn_10_1 != 0;
                if (this.field_S) {
                  this.field_R.a(true, 4210752, 8405024);
                  this.field_R.field_w = true;
                  break L3;
                } else {
                  this.field_R.a(true, 4210752, 2113632);
                  if (!this.field_T) {
                    break L3;
                  } else {
                    this.field_R.field_w = false;
                    if (!Transmogrify.field_A) {
                      break L3;
                    } else {
                      this.field_R.a(true, 4210752, 8405024);
                      this.field_R.field_w = true;
                      break L3;
                    }
                  }
                }
              }
            }
            L5: {
              if (param2 == -27) {
                break L5;
              } else {
                sd.e((byte) 2);
                break L5;
              }
            }
            this.field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
            this.field_P = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("sd.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ci param0, boolean param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ci var8 = null;
        hj var9 = null;
        hj var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = new hj(param0.a("", (byte) 124, "logo.fo3d"));
                        var10 = var9;
                        var3 = var10.d((byte) 121);
                        var10.h((byte) 106);
                        if (param1) {
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
                    try {
                        var8 = (ci) null;
                        sd.a((ci) null, true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        rg.field_L = u.a(var10, (byte) 26);
                        ae.field_a = new int[var3][];
                        rf.field_eb = new e[var3];
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 <= var4) {
                            statePc = 8;
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
                        rf.field_eb[var4] = nb.a(param1, var9);
                        var4++;
                        if (var7 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10.n(0);
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
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 >= var3) {
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
                        var5 = rf.field_eb[var4];
                        var5.a(1, -22861, 6, 6, 6);
                        var5.a(22856);
                        var6 = new int[]{var5.field_t + var5.field_P >> -517201119, var5.field_u + var5.field_O >> 522960001, var5.field_k + var5.field_i >> 1678425313};
                        ae.field_a[var4] = var6;
                        var5.a(-var6[2], -var6[0], -var6[1], (byte) -127);
                        var4++;
                        if (var7 == 0) {
                            statePc = 13;
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
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        return;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var2);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("sd.C(");
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
                    throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(byte param0) {
        field_V = null;
        field_Q = null;
        int var1 = 81 / ((47 - param0) / 43);
    }

    static {
        field_Q = "You are not currently logged in to the<nbsp>game.";
        field_V = "Type your email address again to make sure it's correct";
    }
}
