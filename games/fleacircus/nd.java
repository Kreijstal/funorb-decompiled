/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends jj {
    private lk field_ab;
    private String field_bb;
    private boolean field_db;
    private boolean field_cb;
    private String field_eb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        rg.field_o.a(this.field_eb, param1 + (this.field_u >> 1611750049), 103 + param0, 16777215, -1);
        if (!(this.field_bb == null)) {
            gb.b(20 + param1, 120 + param0 - 7, 260, 8421504);
            rg.field_o.a(this.field_bb, param1 + 20, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, rg.field_o.field_H);
        }
    }

    final static hf[] a(boolean param0, ce param1) {
        hf[] stackIn_3_0 = null;
        hf[] stackIn_14_0 = null;
        hf[] stackIn_18_0 = null;
        hf[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        hf[] var4 = null;
        int var5 = 0;
        hf var6 = null;
        int var7 = 0;
        ce var8 = null;
        od var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.a(125)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = new hf[]{};
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = (ce) null;
                        nd.a(false, (ce) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = param1.b((byte) 122);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (0 != var9.field_b) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        vh.a(10L, 38);
                        if (var7 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (2 == var9.field_b) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = new hf[]{};
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    try {
                        var11 = (int[]) (var9.field_e);
                        var10 = var11;
                        var3 = var10;
                        var4 = new hf[var11.length >> 1990360290];
                        var5 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4.length <= var5) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6 = new hf();
                        stackIn_21_0 = (hf[]) (var4);
                        stackIn_18_0 = stackIn_21_0;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_18_0[var5] = var6;
                        var6.field_c = var3[var5 << -2115893758];
                        var6.field_a = var3[(var5 << -171063742) + 1];
                        var6.field_i = var3[2 + (var5 << -605150654)];
                        var6.field_j = var3[3 + (var5 << -1561869950)];
                        var5++;
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (hf[]) (var4);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var2);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("nd.BA(").append(param0).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param1 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw pf.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(String param0, float param1, boolean param2, int param3) {
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_db) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (param2 ? 1 : 0)) {
                L3: {
                  stackIn_7_0 = this;

                  if (!param2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((nd) (this)).field_db = stackIn_8_1 != 0;
                if (this.field_db) {
                  this.field_ab.a((byte) 108, 4210752, 8405024);
                  this.field_ab.field_H = true;
                  break L2;
                } else {
                  this.field_ab.a((byte) 79, 4210752, 2113632);
                  if (!this.field_cb) {
                    break L2;
                  } else {
                    this.field_ab.field_H = false;
                    if (!fleas.field_A) {
                      break L2;
                    } else {
                      this.field_ab.a((byte) 108, 4210752, 8405024);
                      this.field_ab.field_H = true;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            this.field_eb = param0;
            this.field_ab.field_I = (int)(param1 / 100.0f * 65536.0f);
            if (param3 < -112) {
              break L0;
            } else {
              this.field_cb = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("nd.AA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void n(int param0) {
        if (param0 != 100) {
          this.b(-71, 115, -86);
          this.field_cb = true;
          this.field_ab.field_H = false;
          return;
        } else {
          this.field_cb = true;
          this.field_ab.field_H = false;
          return;
        }
    }

    nd(f param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_bb = param1;
            if (null != this.field_bb) {
                var3_int = rg.field_o.b(this.field_bb, 260, rg.field_o.field_H);
                this.a(150 + var3_int, (byte) -128, 300);
            }
            this.field_ab = new lk(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_cb = false;
            this.field_db = false;
            this.field_ab.field_H = true;
            this.a((qa) (this.field_ab), (byte) -63);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
