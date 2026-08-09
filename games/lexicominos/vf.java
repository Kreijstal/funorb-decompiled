/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends kd {
    private int field_j;
    private int field_t;
    int field_n;
    private int field_p;
    private int field_k;
    static aj field_m;
    private int field_q;
    int field_i;
    private String field_l;
    static int field_r;
    private int field_h;
    static String field_s;
    private int field_o;

    final void a(int param0, int param1, int param2) {
        this.a(param2, (byte) 108, param0 * 24 + this.field_k, this.field_t);
        if (param1 != 32211) {
            this.a(88, (byte) -108, 54, -70);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 82 / ((param1 - 28) / 58);
        this.field_q = this.field_n;
        this.field_t = param3;
        this.field_p = this.field_i;
        this.field_k = param2;
        this.field_o = this.field_h;
        this.field_j = param0;
    }

    final void a(int param0, boolean param1) {
        if (!(-1 != (param0 ^ -1))) {
            this.field_i = this.field_t;
            this.field_n = this.field_k;
            this.field_h = 0;
            return;
        }
        this.field_h = this.field_o * param0 / this.field_j;
        this.field_i = (this.field_p + -this.field_t) * param0 / this.field_j + this.field_t;
        this.field_n = this.field_k + param0 * (-this.field_k + this.field_q) / this.field_j;
        if (!param1) {
            field_s = (String) null;
        }
    }

    public static void a(byte param0) {
        kd var2;
        if (param0 >= -14) {
          var2 = (kd) null;
          vf.a((kd) null, -20, (kd) null);
          field_m = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_s = null;
          return;
        }
    }

    final static void a(boolean param0, sh param1) {
        db var2 = new db(param1.a((byte) 127, "", "final_frame.jpg"), (java.awt.Component) ((Object) ug.field_y));
        int var3 = var2.field_p;
        int var4 = var2.field_u;
        ja.b((byte) -126);
        nc.field_n = new db(var3, var4 * 3 / 4);
        if (param0) {
            return;
        }
        try {
            nc.field_n.b();
            var2.b(0, 0);
            jg.field_m = new db(var3, -nc.field_n.field_u + var4);
            jg.field_m.b();
            var2.b(0, -nc.field_n.field_u);
            jg.field_m.field_w = nc.field_n.field_u;
            pd.a(-22949);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, oj param1, int param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        db var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        db var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 == this.field_h) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var19 = ne.field_b[this.field_h % 32];
                        var4 = var19;
                        var5 = (ia.field_H.field_p + -var19.field_p) / 2;
                        var6 = this.field_l.length();
                        var7 = (double)this.field_h * 3.141592653589793 / 64.0;
                        var9 = (double)(var5 + (this.field_i + param2));
                        var11 = (double)(var5 + this.field_n);
                        var13 = 24.0 * Math.cos(var7);
                        var15 = 24.0 * Math.sin(var7);
                        var17 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6 <= var17) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        eb.a(29, param1, 0, var4, this.field_l.charAt(var17), (int)Math.round(var11), (int)Math.round(var9));
                        var11 = var11 + var15;
                        var9 = var9 + var13;
                        var17++;
                        if (var18 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var18 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var18 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        eh.a(0, lg.field_c, param2 - -this.field_i, 0, this.field_l, this.field_n);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == 17517) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_n = 31;
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var4_ref);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("vf.E(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(kd param0, int param1, kd param2) {
        RuntimeException var3 = null;
        kd var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param2.field_c) {
                param2.b((byte) -120);
                break L1;
              } else {
                break L1;
              }
            }
            param2.field_f = param0;
            param2.field_c = param0.field_c;
            param2.field_c.field_f = param2;
            param2.field_f.field_c = param2;
            if (param1 == 0) {
              break L0;
            } else {
              var4 = (kd) null;
              vf.a((kd) null, 14, (kd) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vf.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    vf(String param0, int param1, int param2, boolean param3) {
        try {
            this.field_n = param2;
            this.field_h = param3 ? 32 : 0;
            this.field_l = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = -1;
        field_s = "This password is part of your Player Name, and would be easy to guess";
        field_m = new aj(13, 0, 1, 0);
    }
}
